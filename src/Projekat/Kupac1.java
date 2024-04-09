package Projekat;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class Kupac1 extends JFrame {
	
	private ArrayList<Kupac> lista = new ArrayList<>();

	private JPanel contentPane;
	private JTextField textFieldIme;
	private JTextField textFieldPrezime;
	private JTextField textFieldAdresa;
	private JTextField textBeTelefona;
	
	public void close() {
		WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kupac1 frame = new Kupac1();
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
	public Kupac1() {
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 285, 242);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPodaci = new JPanel();
		panelPodaci.setBackground(SystemColor.activeCaption);
		panelPodaci.setBorder(new TitledBorder(null, "Uneti podatke", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panelPodaci.setBounds(10, 11, 250, 180);
		contentPane.add(panelPodaci);
		panelPodaci.setLayout(null);
		
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblIme.setHorizontalAlignment(SwingConstants.CENTER);
		lblIme.setBounds(10, 27, 86, 14);
		panelPodaci.add(lblIme);
		
		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblPrezime.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrezime.setBounds(10, 51, 86, 14);
		panelPodaci.add(lblPrezime);
		
		JLabel lblAdresa = new JLabel("Adresa:");
		lblAdresa.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblAdresa.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdresa.setBounds(10, 75, 86, 14);
		panelPodaci.add(lblAdresa);
		
		textFieldIme = new JTextField();
		textFieldIme.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIme.setFont(new Font("Rockwell", Font.BOLD, 14));
		textFieldIme.setBounds(102, 24, 126, 20);
		panelPodaci.add(textFieldIme);
		textFieldIme.setColumns(10);
		
		textFieldPrezime = new JTextField();
		textFieldPrezime.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPrezime.setFont(new Font("Rockwell", Font.BOLD, 14));
		textFieldPrezime.setColumns(10);
		textFieldPrezime.setBounds(102, 48, 126, 20);
		panelPodaci.add(textFieldPrezime);
		
		textFieldAdresa = new JTextField();
		textFieldAdresa.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldAdresa.setFont(new Font("Rockwell", Font.BOLD, 14));
		textFieldAdresa.setColumns(10);
		textFieldAdresa.setBounds(102, 72, 126, 20);
		panelPodaci.add(textFieldAdresa);
		
		JButton btnNazad = new JButton("Nazad");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				close();
				Kupac1 k = new Kupac1();
				k.setVisible(false);
				
			}
		});
		btnNazad.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\Go-back-icon.png"));
		btnNazad.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnNazad.setBounds(10, 146, 101, 23);
		panelPodaci.add(btnNazad);
		
		JButton btnPotvrdi = new JButton("Potvrdi");
		btnPotvrdi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ime = textFieldIme.getText();
				String prezime = textFieldPrezime.getText();
				String adresa = textFieldAdresa.getText();
				String brTel = textBeTelefona.getText();
				
				try {
					Kupac k = new Kupac(ime, prezime, adresa, brTel);
					lista.add(k);
					
					textFieldIme.setText("");
					textFieldPrezime.setText("");
					textFieldAdresa.setText("");
					textBeTelefona.setText("");
					
					JOptionPane.showMessageDialog(null, "Porudzbina je uspesno obavljena.");
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Greska prilikom unosa podataka!");
				}	
			}
		});
		btnPotvrdi.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\ok.png"));
		btnPotvrdi.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnPotvrdi.setBounds(121, 146, 119, 23);
		panelPodaci.add(btnPotvrdi);
		
		JLabel lblBrTelefona = new JLabel("Br. tel.");
		lblBrTelefona.setHorizontalAlignment(SwingConstants.CENTER);
		lblBrTelefona.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblBrTelefona.setBounds(10, 99, 86, 14);
		panelPodaci.add(lblBrTelefona);
		
		textBeTelefona = new JTextField();
		textBeTelefona.setHorizontalAlignment(SwingConstants.RIGHT);
		textBeTelefona.setFont(new Font("Rockwell", Font.BOLD, 14));
		textBeTelefona.setColumns(10);
		textBeTelefona.setBounds(102, 98, 126, 20);
		panelPodaci.add(textBeTelefona);
	}
}
