package com.company;

import java.io.IOException;
import java.io.Writer;

/**
 * A writer implementation that encrypts the characters written.
 *
 * @author YOU!
 */
public class SubstitutionCipherWriter extends Writer {

    // Fields

    private Writer writer;
    private Cipher cipher;

    // Constructors

    /**
     * Create a cipher writer.
     * @param cipher the cipher to use to decrypt the input characters.
     * @param writer the writer stream to write characters to.
     */
    public SubstitutionCipherWriter(Cipher cipher, Writer writer) {
        this.cipher = cipher;
        this.writer = writer;
    }

    // Methods
    
    @Override
    public void write(char[] buffer, int off, int len) throws IOException {
        // TODO
    }

    @Override
    public void flush() throws IOException {
        // TODO
    }

    @Override
    public void close() throws IOException {
        // TODO
    }
}
