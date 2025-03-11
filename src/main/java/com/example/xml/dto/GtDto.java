package com.example.xml.dto;

import jakarta.xml.bind.annotation.*;

/**
 * Greater than expression DTO
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GtDto {
    @XmlElement(name = "left", namespace = "https://example.org/istar-t")
    private LeftDto left;

    @XmlElement(name = "right", namespace = "https://example.org/istar-t")
    private RightDto right;

    // Getters and setters
    public LeftDto getLeft() { return left; }
    public void setLeft(LeftDto left) { this.left = left; }

    public RightDto getRight() { return right; }
    public void setRight(RightDto right) { this.right = right; }
}