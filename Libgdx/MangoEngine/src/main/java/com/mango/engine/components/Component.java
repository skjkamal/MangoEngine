package com.mango.engine.components;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.mango.engine.Node;

public interface Component
{
    void init() ;
    void update(Node node, Batch spriteBatch) ;
}
