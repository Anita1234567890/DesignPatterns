package com.company.ElementImplementation;

import com.company.ElementImplementation.Composite.Element;
import com.company.ElementImplementation.Composite.IterableElement;
import com.company.ElementImplementation.Visitor.Visitor;

import java.util.ArrayList;

public class Section extends IterableElement {
    private String title;
    public Section() {
        super(null);
    }

    public Section( String title) {
        super(null);
        this.title = title;
    }

    @Override
    public void print() {
        System.out.print(title);
        super.print();
    }
}
