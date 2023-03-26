package aula1003;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela01 extends JFrame {

	private JPanel bntLimpar;
	private JLabel lblNewLabel;
	private JLabel lblSorveteDeFrutas;
	private JLabel lblChocolatefrutas;
	private JLabel lblBola;
	private JLabel lblPoteDe;
	private JLabel lblQtde;
	private JLabel lblPreoUnitrio;
	private JTextField txtQtdeSorvete;
	private JTextField txtQtdeChoco;
	private JTextField txtQtdeBola;
	private JTextField txtQtdeLitro;
	private JTextField txtPrecoSorvete;
	private JTextField txtPrecoChoco;
	private JTextField txtPrecoBola;
	private JTextField txtPrecoLitro;
	private JTextField txtTotal;
	private JLabel lblTotal;
	private JButton bntCalcular;
	private JButton btnLimpar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela01 frame = new Tela01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela01() {
		setFont(new Font("Dialog", Font.BOLD, 17));
		setTitle("Sorveteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 517);
		bntLimpar = new JPanel();
		bntLimpar.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(bntLimpar);
		bntLimpar.setLayout(null);
		
		lblNewLabel = new JLabel("Tipo de Sorvete");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 10, 166, 32);
		bntLimpar.add(lblNewLabel);
		
		lblSorveteDeFrutas = new JLabel("Sorvete de Frutas");
		lblSorveteDeFrutas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSorveteDeFrutas.setBounds(10, 70, 166, 32);
		bntLimpar.add(lblSorveteDeFrutas);
		
		lblChocolatefrutas = new JLabel("Chocolate/Frutas");
		lblChocolatefrutas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChocolatefrutas.setBounds(10, 125, 166, 32);
		bntLimpar.add(lblChocolatefrutas);
		
		lblBola = new JLabel("Bola");
		lblBola.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBola.setBounds(10, 176, 166, 32);
		bntLimpar.add(lblBola);
		
		lblPoteDe = new JLabel("Pote de 2 Litros");
		lblPoteDe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPoteDe.setBounds(10, 235, 166, 32);
		bntLimpar.add(lblPoteDe);
		
		lblQtde = new JLabel("Qtde");
		lblQtde.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQtde.setBounds(214, 10, 166, 32);
		bntLimpar.add(lblQtde);
		
		lblPreoUnitrio = new JLabel("Preço Unitário");
		lblPreoUnitrio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPreoUnitrio.setBounds(464, 10, 166, 32);
		bntLimpar.add(lblPreoUnitrio);
		
		txtQtdeSorvete = new JTextField();
		txtQtdeSorvete.setText("0");
		txtQtdeSorvete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtQtdeSorvete.setBounds(211, 71, 187, 32);
		bntLimpar.add(txtQtdeSorvete);
		txtQtdeSorvete.setColumns(10);
		
		txtQtdeChoco = new JTextField();
		txtQtdeChoco.setText("0");
		txtQtdeChoco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtQtdeChoco.setColumns(10);
		txtQtdeChoco.setBounds(211, 125, 187, 32);
		bntLimpar.add(txtQtdeChoco);
		
		txtQtdeBola = new JTextField();
		txtQtdeBola.setText("0");
		txtQtdeBola.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtQtdeBola.setColumns(10);
		txtQtdeBola.setBounds(211, 176, 187, 32);
		bntLimpar.add(txtQtdeBola);
		
		txtQtdeLitro = new JTextField();
		txtQtdeLitro.setText("0");
		txtQtdeLitro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtQtdeLitro.setColumns(10);
		txtQtdeLitro.setBounds(211, 235, 187, 32);
		bntLimpar.add(txtQtdeLitro);
		
		txtPrecoSorvete = new JTextField();
		txtPrecoSorvete.setText("0.00");
		txtPrecoSorvete.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPrecoSorvete.setColumns(10);
		txtPrecoSorvete.setBounds(464, 70, 187, 32);
		bntLimpar.add(txtPrecoSorvete);
		
		txtPrecoChoco = new JTextField();
		txtPrecoChoco.setText("0.00");
		txtPrecoChoco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPrecoChoco.setColumns(10);
		txtPrecoChoco.setBounds(464, 125, 187, 32);
		bntLimpar.add(txtPrecoChoco);
		
		txtPrecoBola = new JTextField();
		txtPrecoBola.setText("0.00");
		txtPrecoBola.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPrecoBola.setColumns(10);
		txtPrecoBola.setBounds(464, 176, 187, 32);
		bntLimpar.add(txtPrecoBola);
		
		txtPrecoLitro = new JTextField();
		txtPrecoLitro.setText("0.00");
		txtPrecoLitro.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPrecoLitro.setColumns(10);
		txtPrecoLitro.setBounds(464, 235, 187, 32);
		bntLimpar.add(txtPrecoLitro);
		
		txtTotal = new JTextField();
		txtTotal.setEnabled(false);
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotal.setColumns(10);
		txtTotal.setBounds(464, 303, 187, 32);
		bntLimpar.add(txtTotal);
		
		lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(211, 303, 166, 32);
		bntLimpar.add(lblTotal);
		
		bntCalcular = new JButton("Calcular");
		bntCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int qtdeSorvete = Integer.parseInt(txtQtdeSorvete.getText());
				int qtdeChoco = Integer.parseInt(txtQtdeChoco.getText());
				int qtdeBola = Integer.parseInt(txtQtdeBola.getText());
				int qtdeLitro = Integer.parseInt(txtQtdeBola.getText());
				
				double precoSorvete = Double.parseDouble(txtPrecoSorvete.getText());
				double precoChoco = Double.parseDouble(txtPrecoChoco.getText());
				double precoBola = Double.parseDouble(txtPrecoBola.getText());
				double precoLitro = Double.parseDouble(txtPrecoLitro.getText());
				
				double total = (qtdeSorvete * precoSorvete) + (qtdeChoco * precoChoco) + (qtdeBola * precoBola) + (qtdeLitro * precoLitro);
				
				txtTotal.setText(String.valueOf(total));
				
			}
		});
		bntCalcular.setFont(new Font("Tahoma", Font.PLAIN, 20));
		bntCalcular.setBounds(211, 394, 187, 38);
		bntLimpar.add(bntCalcular);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtQtdeSorvete.setText(null);
				txtQtdeChoco.setText(null);
				txtQtdeBola.setText(null);
				txtQtdeLitro.setText(null);
				txtPrecoSorvete.setText(null);
				txtPrecoChoco.setText(null);
				txtPrecoBola.setText(null);
				txtPrecoLitro.setText(null);
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimpar.setBounds(464, 394, 187, 38);
		bntLimpar.add(btnLimpar);
	}
}
