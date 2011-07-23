package com.scoutsys.render;

public class RenderNoGraphicsException extends RenderException {
    public RenderNoGraphicsException() {
        super(RenderException.NO_GRAPHICS);
    }
}