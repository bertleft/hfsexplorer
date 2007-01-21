/*-
 * Copyright (C) 2006 Erik Larsson
 * 
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA
 */

import java.io.PrintStream;

/** This class was generated by CStructToJavaClass. */
public class ExtendedFileInfo {
    /*
     * struct ExtendedFileInfo
     * size: 16 bytes
     * description: 
     * 
     * BP  Size  Type       Identifier           Description
     * -----------------------------------------------------
     * 0   2*4   SInt16[4]  reserved1                       
     * 8   2     UInt16     extendedFinderFlags             
     * 10  2     SInt16     reserved2                       
     * 12  4     SInt32     putAwayFolderID                 
     */
    
    private final byte[] reserved1 = new byte[2*4];
    private final byte[] extendedFinderFlags = new byte[2];
    private final byte[] reserved2 = new byte[2];
    private final byte[] putAwayFolderID = new byte[4];
    
    public ExtendedFileInfo(byte[] data, int offset) {
	System.arraycopy(data, offset+0, reserved1, 0, 2*4);
	System.arraycopy(data, offset+8, extendedFinderFlags, 0, 2);
	System.arraycopy(data, offset+10, reserved2, 0, 2);
	System.arraycopy(data, offset+12, putAwayFolderID, 0, 4);
    }
    
    public static int length() { return 16; }
    
    public short[] getReserved1() { return Util2.readShortArrayBE(reserved1); }
    public short getExtendedFinderFlags() { return Util.readShortBE(extendedFinderFlags); }
    public short getReserved2() { return Util.readShortBE(reserved2); }
    public int getPutAwayFolderID() { return Util.readIntBE(putAwayFolderID); }
    
    public void printFields(PrintStream ps, String prefix) {
	ps.println(prefix + " reserved1: " + getReserved1());
	ps.println(prefix + " extendedFinderFlags: " + getExtendedFinderFlags());
	ps.println(prefix + " reserved2: " + getReserved2());
	ps.println(prefix + " putAwayFolderID: " + getPutAwayFolderID());
    }
    
    public void print(PrintStream ps, String prefix) {
	ps.println(prefix + "ExtendedFileInfo:");
	printFields(ps, prefix);
    }
}
