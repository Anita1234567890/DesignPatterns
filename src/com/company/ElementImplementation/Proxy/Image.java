package com.company.ElementImplementation.Proxy;

import com.company.ElementImplementation.Composite.Element;
import com.company.ElementImplementation.Visitor.Visitor;

public class Image extends Element {
    private String imageName;
    public Image(String imageName) {
        super();
        this.imageName = imageName;
    }

    @Override
    public void print() {
        System.out.print(imageName);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }

}
