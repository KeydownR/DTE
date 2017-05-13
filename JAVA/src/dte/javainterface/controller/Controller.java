/*
 * GNU General Public License v3 (GPL-3)
 *
 * Copyright 2017
 * Christophe Van Waesberghe <contact@chrisv.be>
 * Amélie Courtin <a.courtin@students.ephec.be>
 * Mathieu Rousseau <m.rousseau@students.ephec.be>
 * Nathan Dolinsky <n.dolinski@students.ephec.be>
 * (Groupe 05, 2016/17)
 * 
 * The DTE Java Interface is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * The DTE Java Interface is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with the DTE Java Interface and the whole DTE Project.  If not, see <http://www.gnu.org/licenses/>.
 */
package dte.javainterface.controller;

import dte.javainterface.model.Model;
import dte.javainterface.view.View;
import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Controller of the App. Manage all the functionalities
 */
public class Controller {

    private final Model model;
    private View view;

    /**
     * Controller's constructor with a Model in parametter
     *
     * @param model
     */
    public Controller(Model model) {
        this.model = model;
    }

    /**
     * Connect a view to this controller
     *
     * @param view
     */
    public void addView(View view) {
        this.view = view;
    }
    
    public void connect(String selectedPortIdentifier){
        //CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(selectedPortIdentifier);
        //SerialPort serialPort = (SerialPort) portIdentifier.open("PIC", 0);
        //serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        
        
    }
    
}
