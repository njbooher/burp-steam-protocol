package in.dragonbra.javasteam.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import java.util.zip.GZIPInputStream;

/**
 * @author lngtr
 * @since 2018-02-23
 */
public class Utils {
    /**
     * Convenience method for calculating the CRC2 checksum of a string.
     *
     * @param s the string
     * @return long value of the CRC32
     */
    public static long crc32(String s) {
        Checksum checksum = new CRC32();
        byte[] bytes = s.getBytes();
        checksum.update(bytes, 0, bytes.length);
        return checksum.getValue();
    }


    public static byte[] gunzip(byte[] inputBytes) throws IOException {
        GZIPInputStream gzin = new GZIPInputStream(new ByteArrayInputStream(inputBytes));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int res = 0;
        byte[] buf = new byte[1024];
        while (res >= 0) {
            res = gzin.read(buf, 0, buf.length);
            if (res > 0) {
                baos.write(buf, 0, res);
            }
        }
        return baos.toByteArray();
    }


}