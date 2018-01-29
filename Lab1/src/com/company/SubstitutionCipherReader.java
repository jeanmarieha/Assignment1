package com.company;

import java.io.IOException;
import java.io.Reader;

/**
 * A reader implementation that decrypts the characters read.
 *
 * @author YOU!
 */
public class SubstitutionCipherReader extends Reader {

    // Fields

    private Reader reader;
    private Cipher cipher;

    // Constructor
    
    /**
     * Create a cipher reader.
     * @param cipher the cipher to use to decrypt the input characters.
     * @param reader the reader stream to draw characters from.
     */
    public SubstitutionCipherReader(Cipher cipher, Reader reader) {
        this.cipher = cipher;
        this.reader = reader;
    }

    // Methods
    
    @Override
    public int read(char[] buffer, int off, int len) throws IOException {
        // TODO
    }

    @Override
    public void close() throws IOException {
        // TODO
    }
}
