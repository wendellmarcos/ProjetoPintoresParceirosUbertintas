/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.DTO;

/**
 *
 * @author Wendell
 */
public class UsuarioConstrutoraDTO extends UsuarioDTO{
    
    private String cnpj;

   public void UsuarioConstrutoraDTO(){
        
    }
    
    public String getCnpj() {
        return cnpj;
    }
  
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}


