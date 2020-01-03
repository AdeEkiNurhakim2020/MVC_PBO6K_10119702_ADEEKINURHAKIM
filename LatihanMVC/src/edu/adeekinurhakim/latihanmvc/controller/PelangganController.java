/*NIM   : 10119702
* NAMA  : ADE EKI NURHAKIM
* KELAS : IF2
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.adeekinurhakim.latihanmvc.controller;

import edu.adeekinurhakim.latihanmvc.model.PelangganModel;
import edu.adeekinurhakim.latihanmvc.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Ade Eki Nurhakim
 */
public class PelangganController extends PelangganView{
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String Telp = view.getTxtTelp().getText();
        
        if(nama.equals("") && email.equals("") && Telp.equals("")){
            
        }else {
            model.resetForm();
        }
    }
    public void simpanForm(PelangganView view){
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String Telp = view.getTxtTelp().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        }else if(Telp.trim().equals("")){
            JOptionPane.showMessageDialog(view, "No Telp Masih Kosong");
        }else{
            model.simpanForm();
        }
    }
}