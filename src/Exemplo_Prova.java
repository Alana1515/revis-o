import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exemplo_Prova {
    private JTextField txtValor;
    private JPanel panelMain;
    private JButton btnExibir;
    String operacao = "";
    Integer valor = 0;
    String soma =

    public Exemplo_Prova() {
        btnExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer valor = Integer.parseInt(txtValor.getText());
                if(operacao.equals("+)")){
                    soma = valor + valorDois;
                }
                txtValor.setText(String.valueOf(soma));
            }
        });
    }

    public static void main(String[] args) {
        //criar a tela
        JFrame tela = new JFrame();
        //criar o titulo na tela
        tela.setTitle("Minha TV");
        //tamanho da tela
        tela.setSize(500, 500);

        tela.setContentPane(new Exemplo_Prova(). panelMain);
        //para tela ficar visivel
        tela.setVisible(true);
    }
}
