/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 3260058
 */
public class Place implements PlaceIF
{

  private int init;
  private String id;

   @Override public int getInit ()
  {
    return init;
  }

   @Override public String getID ()
  {
    return id;
  }
   
   @Override public void setID(String i)
   {
       this.id = id;
   }

  public Place (String id)
  {
    this.init = 0;
    this.id = id;
  }
  
  public void setInit(int i){
      init = i;
  }

}
