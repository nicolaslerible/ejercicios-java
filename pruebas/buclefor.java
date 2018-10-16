/*
 * buclefor.java
 * 
 * Copyright 2018 Linux User <tux@slitaz>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class untitled {
	
	public static void main (String args[]) {
		int acumulador = 0;
    int sumando;
    
    for (;;){
    System.out.println("introduzca un sumando(0 para terminar): ");
    sumando = Integer.parseInt(System.console().readLine());
    acumulador += sumando;
  }
  System.out.println("la suma es: ");
	}
}

