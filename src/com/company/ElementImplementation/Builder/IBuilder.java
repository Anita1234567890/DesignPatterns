package com.company.ElementImplementation.Builder;
import com.company.ElementImplementation.Composite.Element;

public interface IBuilder {
    IBuilder buildPart() ;
    Element getResult();
}
