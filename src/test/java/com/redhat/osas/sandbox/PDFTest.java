package com.redhat.osas.sandbox;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * User: jottinge
 * Date: 6/5/14
 * Time: 2:32 PM
 */
public class PDFTest {
    @Test
    public void openPDFTest() throws IOException {
        System.out.println("About to open PDF");
        InputStream pdf=this.getClass().getResourceAsStream("/monitor_modes.pdf");
        PDDocument d = PDDocument.load(pdf);
        System.out.println("Here");
        PDFTextStripper ts = new PDFTextStripper();
        System.out.println(ts.getText(d));
    }
}
