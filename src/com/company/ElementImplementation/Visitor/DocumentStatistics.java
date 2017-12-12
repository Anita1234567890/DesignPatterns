package com.company.ElementImplementation.Visitor;

import com.company.ElementImplementation.Composite.Element;

public class DocumentStatistics implements Visitor{
    protected int numberOfSections = 0;
    protected int numberOfImages = 0;
    protected int numberOfParagraph = 0;
    protected int numberOfTables = 0;

    @Override
    public void visitSection(Element e) {
        numberOfSections++;
    }

    @Override
    public void visitImageProxy(Element e) {
        numberOfImages++;
    }

    @Override
    public void visitImage(Element e) {
        numberOfImages++;
    }

    @Override
    public void visitParagraph(Element e) {
        numberOfParagraph++;
    }

    @Override
    public void visitTable(Element e) {
        numberOfTables++;
    }

    public void printStatistics() {

    }
}
