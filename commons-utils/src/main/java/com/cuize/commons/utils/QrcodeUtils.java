package com.cuize.commons.utils;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringUtils;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.Result;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/**
 * 二维码生成与解析
 * @author Wangwei
 *
 */
public class QrcodeUtils {
	
	private static final String CHARSET = "utf-8";
    private static final String FORMAT_NAME = "JPG";
    // 二维码尺寸
    private static final int QRCODE_SIZE = 300;
    // LOGO宽度
    private static final int WIDTH = 60;
    // LOGO高度
    private static final int HEIGHT = 60;
    
    
	
	public static void main(String[] args) throws Exception {
//        String text = "10201603182057_15221917486_10_15_5";
//        createQRcode("10201603182057","15221917486","10","d:/MyWorkDoc/");
//        QrcodeUtils.encode(text, "d:/MyWorkDoc/my180.jpg", "d:/MyWorkDoc", true,"helloWord");
        String qrUrl=createQRcode("118205DD_15221917486_1","d:/MyWorkDoc");
        System.out.println("二维码地址:"+qrUrl+"=============");
	}
	
	/**
	 * 
	 * @param barCode 调用环企下单接口返回的凭证号
	 * @param path 二维码保存地址
	 * @return 二维码的地址
	 */
	public static String createHqQRcode(String barCode,String path){
		try {
			if(StringUtils.isNotBlank(barCode) && StringUtils.isNotBlank(path)){
				String qrcodeImgName = UUID.randomUUID().toString();
			    if(qrcodeImgName.contains("-")){
				    qrcodeImgName=qrcodeImgName.replaceAll("-", "");
			    }
			    Date date=new Date();
			    String directory = DateUtils.formatDate(date, "yyyyMMdd");
			    if(!path.endsWith("/")){
			    	path+="/";
			    }
			    path=path+directory;
			    File file=new File(path);
			    if(!file.exists()){
			    	file.mkdir();
			    }
			    byte[] strCode = QRCodeHandler.encode(barCode);
		        FileOutputStream out = new FileOutputStream(path+"/"+qrcodeImgName+".png");
		        out.write(strCode);
		        out.close();
			    return path+"/"+qrcodeImgName+".png";
			}
			
		 } catch (Exception e) {
		     e.printStackTrace();
		 }
		return null;
	}
	
	public static String createQRcode(String orderNo,String mobilePhone,String shopid,String path){
		return "";
	}
	
	/**
	 * 生成二维码
	 * content 格式：订单号_手机号_景区ID_产品ID_门票数量
	 * path 二维码保存地址
	 * orderNo:订单号
	 * mobilephone:手机号
	 * shopId:景点ID
	 * productId:门票ID
	 * quantity:数量
	 */
	public static String createQRcode(String content,String path){
		try {
			if(StringUtils.isNotBlank(content) && StringUtils.isNotBlank(path)){
				String qrcodeImgName = UUID.randomUUID().toString();//二维码的名称
			    if(qrcodeImgName.contains("-")){
				    qrcodeImgName=qrcodeImgName.replaceAll("-", "");
			    }
			    Date date=new Date();
			    
//			    String path="/opt/upload/";
			    if(!path.endsWith("/")){
			    	path+="/";
			    }
			    String directory = DateUtils.formatDate(date, "yyyyMMdd");
			    path=path+directory;
			    File file=new File(path);
			    if(!file.exists()){
			    	file.mkdir();
			    }
//			    String content=orderNo+"_"+mobilephone+"_"+shopId;
//			    qrcodeImgName=orderNo+qrcodeImgName;
				QrcodeUtils.encode(content, path+"/my180.jpg", path, false,qrcodeImgName);
			    return path+"/"+qrcodeImgName+".jpg";
			}
			
		 } catch (Exception e) {
		     e.printStackTrace();
		 }
		return null;
	}
	
	public static void encode(String content, String imgPath, String destPath,
            boolean needCompress,String newName) throws Exception {
        BufferedImage image = QrcodeUtils.createImage(content, imgPath,
                needCompress);
        mkdirs(destPath);
        String file = newName+".jpg";
        ImageIO.write(image, FORMAT_NAME, new File(destPath+"/"+file));
    }
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static BufferedImage createImage(String content, String imgPath,
            boolean needCompress) throws Exception {
		Hashtable hints = new Hashtable();
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
        hints.put(EncodeHintType.CHARACTER_SET, CHARSET);
        hints.put(EncodeHintType.MARGIN, 1);
        BitMatrix bitMatrix = new MultiFormatWriter().encode(content,
                BarcodeFormat.QR_CODE, QRCODE_SIZE, QRCODE_SIZE, hints);
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                image.setRGB(x, y, bitMatrix.get(x, y) ? 0xFF000000
                        : 0xFFFFFFFF);
            }
        }
        if (imgPath == null || "".equals(imgPath)) {
            return image;
        }
        // 插入图片
        QrcodeUtils.insertImage(image, imgPath, needCompress);
        return image;
    }
	
	private static void insertImage(BufferedImage source, String imgPath,
            boolean needCompress) throws Exception {
        File file = new File(imgPath);
        if (!file.exists()) {
            return;
        }
        Image src = ImageIO.read(new File(imgPath));
        int width = src.getWidth(null);
        int height = src.getHeight(null);
        if (needCompress) { // 压缩LOGO
            if (width > WIDTH) {
                width = WIDTH;
            }
            if (height > HEIGHT) {
                height = HEIGHT;
            }
            Image image = src.getScaledInstance(width, height,
                    Image.SCALE_SMOOTH);
            BufferedImage tag = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_RGB);
            Graphics g = tag.getGraphics();
            g.drawImage(image, 0, 0, null); // 绘制缩小后的图
            g.dispose();
            src = image;
        }
        // 插入LOGO
        Graphics2D graph = source.createGraphics();
        int x = (QRCODE_SIZE - width) / 2;
        int y = (QRCODE_SIZE - height) / 2;
        graph.drawImage(src, x, y, width, height, null);
        Shape shape = new RoundRectangle2D.Float(x, y, width, width, 6, 6);
        graph.setStroke(new BasicStroke(3f));
        graph.draw(shape);
        graph.dispose();
    }
	
	public static void mkdirs(String destPath) {
        File file =new File(destPath);   
        //当文件夹不存在时，mkdirs会自动创建多层目录，区别于mkdir．(mkdir如果父目录不存在则会抛出异常)
        if (!file.exists() && !file.isDirectory()) {
            file.mkdirs();
        }
    }
	
	
	
	public static void encode(String content, String imgPath, String destPath)
            throws Exception {
		QrcodeUtils.encode(content, imgPath, destPath, false,null);
    }
 
    public static void encode(String content, String destPath,
            boolean needCompress) throws Exception {
	 QrcodeUtils.encode(content, null, destPath, needCompress,null);
    }

   
    public static void encode(String content, String destPath) throws Exception {
    	QrcodeUtils.encode(content, null, destPath, false,null);
    }

   
    public static void encode(String content, String imgPath,
            OutputStream output, boolean needCompress) throws Exception {
        BufferedImage image = QrcodeUtils.createImage(content, imgPath,
                needCompress);
        ImageIO.write(image, FORMAT_NAME, output);
    }

   
    public static void encode(String content, OutputStream output)
            throws Exception {
    	QrcodeUtils.encode(content, null, output, false);
    }

   
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static String decode(File file) throws Exception {
        BufferedImage image;
        image = ImageIO.read(file);
        if (image == null) {
            return null;
        }
        BufferedImageLuminanceSource source = new BufferedImageLuminanceSource(
                image);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
        Result result;
        Hashtable hints = new Hashtable();
        hints.put(DecodeHintType.CHARACTER_SET, CHARSET);
        result = new MultiFormatReader().decode(bitmap, hints);
        String resultStr = result.getText();
        return resultStr;
    }

   
    public static String decode(String path) throws Exception {
        return QrcodeUtils.decode(new File(path));
    }
	
	
	/**
	 * 解析二维码
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void analysisQRCode(String filePath){
		try {
			MultiFormatReader formatReader = new MultiFormatReader();
//			String filePath = "C:/Users/Wangwei/Desktop/jpg/餐巾纸.jpg";
			File file = new File(filePath);
			BufferedImage image = ImageIO.read(file);
			LuminanceSource source = new BufferedImageLuminanceSource(image);
			Binarizer binarizer = new HybridBinarizer(source);
			BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
			Map hints = new HashMap();
			hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
			Result result = formatReader.decode(binaryBitmap, hints);

			System.out.println("result = " + result.toString());
			System.out.println("resultFormat = " + result.getBarcodeFormat());
			System.out.println("resultText = " + result.getText());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
