package com.seleniumAdvanced;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadFile {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// Word file path
		String fileName = "./FilesToUpload//AI.docx";
        
        // Read and print content of the Word file
        FileInputStream fis = new FileInputStream(fileName);
     
        // Instantiate XWPFDocument
        XWPFDocument document1 = new XWPFDocument(fis);
      
           // Get the text from the document1
        for (XWPFParagraph paragraph : document1.getParagraphs()) {
                System.out.println(paragraph.getText());
            }
      
        
        // Pdf file path
        String fileName1 = "./FilesToUpload//ChatGPT.pdf";
        
        // Read and print content of the PDF file
        PDDocument document2 = PDDocument.load(new File(fileName1));
            // Instantiate PDFTextStripper
            PDFTextStripper pdfStripper = new PDFTextStripper();
            
            // Get the text from the document2
            String text = pdfStripper.getText(document2);
            
            // Print the text to the console
            System.out.println(text);    
}
}