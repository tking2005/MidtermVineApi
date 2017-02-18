package nyc.C4Q.tarynking;

/**
 * Created by tarynking on 1/15/17.
 */
public class CleanCode {
}

public class Style {

    /*
     * Assume this method is correctly formatted.
     */
    public static char convertBinaryToHexDigit( final boolean[] src,
                                                final int srcPos )
    {
        if( src.length==0 ){
            throw new IllegalArgumentException( "Cannot convert an empty array." );
        }
        if( src.length>srcPos+3 && src[srcPos+3] ){
            if( src.length>srcPos+2 && src[srcPos+2] ){
                if( src.length>srcPos+1 && src[srcPos+1] ){
                    return src[srcPos]? 'f': 'e';
                }
                return src[srcPos]? 'd': 'c';
            }
            if( src.length>srcPos+1 && src[srcPos+1] ){
                return src[srcPos]? 'b': 'a';
            }
            return src[srcPos]? '9': '8';
        }
        if( src.length>srcPos+2 && src[srcPos+2] ){
            if( src.length>srcPos+1 && src[srcPos+1] ){
                return src[srcPos]? '7': '6';
            }
            return src[srcPos]? '5': '4';
        }
        if( src.length>srcPos+1 && src[srcPos+1] ){
            return src[srcPos]? '3': '2';
        }
        return src[srcPos]? '1': '0';
    }

    /*
     * Reformat this method to match the coding style above.
     */
    public static char binaryToHexDigitMsb0_4bits(final boolean[] src, final int srcPos) {
        if (src.length > 8) {
            throw new IllegalArgumentException("src.length>8: src.length=" + src.length);
        }
        if (src.length - srcPos < 4) {
            throw new IllegalArgumentException("src.length-srcPos<4: src.length=" + src.length + ", srcPos=" + srcPos);
        }
        if (src[srcPos + 3]) {
            if (src[srcPos + 2]) {
                if (src[srcPos + 1]) {
                    return src[srcPos] ? 'f' : '7';
                }
                return src[srcPos] ? 'b' : '3';
            }
            if (src[srcPos + 1]) {
                return src[srcPos] ? 'd' : '5';
            }
            return src[srcPos] ? '9' : '1';
        }
        if (src[srcPos + 2]) {
            if (src[srcPos + 1]) {
                return src[srcPos] ? 'e' : '6';
            }
            return src[srcPos] ? 'a' : '2';
        }
        if (src[srcPos + 1]) {
            return src[srcPos] ? 'c' : '4';
        }
        return src[srcPos] ? '8' : '0';
    }

}
