/**
 * Copyright(c) 2020 GEEK.
 *
 * History:
 *   15-10-26 上午10:55 Created by heb
 */
package com.cuize.commons.utils;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.apache.commons.codec.binary.Base64;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

/**
 * google zxing二维码生成器
 *
 * @author <a href="mailto:heb_ever@sina.com">heb</a>
 * @version 1.0 15-10-26 上午10:55
 */
public class QRCodeHandler
{
    public static byte[] encode(String contents, String format, int width, int height)
    {
        try {
            Map<EncodeHintType, Object> hints = new HashMap<EncodeHintType, Object>();
            hints.put(EncodeHintType.CHARACTER_SET, "ISO8859-1");
            BitMatrix bitMatrix;

            bitMatrix = new MultiFormatWriter().encode(contents, BarcodeFormat.QR_CODE, width, height, hints);

            BufferedImage image = MatrixToImageWriter.toBufferedImage(bitMatrix);

            ByteArrayOutputStream b = new ByteArrayOutputStream();

            ImageIO.write(image, format, b);

            return b.toByteArray();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public static byte[] encode(String content)
    {
        return encode(content, "png", 120, 120);
    }

    public  static void main(String ags[]) throws Exception
    {
//        byte[] bytes = encode("a6105fc8ea7a49b4b0");
        String str = "3c1b9b4e71f74f2aa9";
//        str = new String(str.getBytes("GBK"), "ISO-8859-1");
        byte[] strCode = QRCodeHandler.encode(str);
        FileOutputStream out = new FileOutputStream("C:/Users/Wangwei/Desktop/jar/fafa.png");
        out.write(strCode);
        out.close();
        String code = "data:image/png;base64,"+ Base64.encodeBase64String(strCode);
        System.out.println(code);
    }
}
