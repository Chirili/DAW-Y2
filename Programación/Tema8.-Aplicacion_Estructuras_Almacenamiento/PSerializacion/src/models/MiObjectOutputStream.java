/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Andres
 */
import java.io.*;
 
public class MiObjectOutputStream extends ObjectOutputStream  {
 
    @Override
    protected void writeStreamHeader() throws IOException
    {
    }
 
 
    public MiObjectOutputStream () throws IOException{
        super();
    }
    public MiObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }
}
