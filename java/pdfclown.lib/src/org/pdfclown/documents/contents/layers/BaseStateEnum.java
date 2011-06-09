/*
  Copyright 2011 Stefano Chizzolini. http://www.pdfclown.org

  Contributors:
    * Stefano Chizzolini (original code developer, http://www.stefanochizzolini.it)

  This file should be part of the source code distribution of "PDF Clown library"
  (the Program): see the accompanying README files for more info.

  This Program is free software; you can redistribute it and/or modify it under the terms
  of the GNU Lesser General Public License as published by the Free Software Foundation;
  either version 3 of the License, or (at your option) any later version.

  This Program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY,
  either expressed or implied; without even the implied warranty of MERCHANTABILITY or
  FITNESS FOR A PARTICULAR PURPOSE. See the License for more details.

  You should have received a copy of the GNU Lesser General Public License along with this
  Program (see README files); if not, go to the GNU website (http://www.gnu.org/licenses/).

  Redistribution and use, with or without modification, are permitted provided that such
  redistributions retain the above copyright notice, license and disclaimer, along with
  this list of conditions.
*/

package org.pdfclown.documents.contents.layers;

import org.pdfclown.objects.PdfName;

/**
  Base state used to initialize the states of all the layers in a document when this configuration
  is applied.

  @author Stefano Chizzolini (http://www.stefanochizzolini.it)
  @since 0.1.1
  @version 0.1.1, 06/08/11
*/
public enum BaseStateEnum
{
  /**
    All the layers are visible.
  */
  On(PdfName.ON),
  /**
    All the layers are invisible.
  */
  Off(PdfName.OFF),
  /**
    All the layers are left unchanged.
  */
  Unchanged(PdfName.Unchanged);

  public static BaseStateEnum valueOf(
    PdfName name
    )
  {
    if(name == null)
      return BaseStateEnum.On;

    for(BaseStateEnum value : values())
    {
      if(value.getName().equals(name))
        return value;
    }
    throw new UnsupportedOperationException("Base state unknown: " + name);
  }

  private PdfName name;

  private BaseStateEnum(
    PdfName name
    )
  {this.name = name;}

  public PdfName getName(
    )
  {return name;}
}