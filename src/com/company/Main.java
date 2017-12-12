package com.company;

import com.company.ElementImplementation.Builder.IBuilder;
import com.company.ElementImplementation.Builder.JSONBuilder;
import com.company.ElementImplementation.Composite.Element;
import com.company.ElementImplementation.Section;
import com.company.ElementImplementation.Visitor.DocumentStatistics;
import com.company.ElementImplementation.Visitor.Visitor;

public class Main {

    public static void main(String[] args) {
        builder();
        visitor();
    }

    public static void visitor()
    {
        Element book = new Section();
        Visitor statistics = new DocumentStatistics();
        book.accept(statistics);
    }

    public static void builder()
    {
        IBuilder builder = new JSONBuilder("D:\\Cod\\Java\\DPLab1\\src\\com\\company\\book.json").
                buildPart();
        Element book = builder.getResult();
        book.print();
    }
}
