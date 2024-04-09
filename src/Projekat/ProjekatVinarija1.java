package Projekat;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class ProjekatVinarija1 extends JFrame {
	
	private ArrayList<Prodaja> lista = new ArrayList<>();
	private ArrayList<Prodaja_sadnica> lista2 = new ArrayList<>();

	private JPanel contentPane;
	private JTextField textFieldBrojFlasa;
	private JTextField textFieldCena;
	private JTextField textFieldUkupnaCena;
	private JTextField textFieldBrojSadnica;
	private JTextField textFieldCenaPoSadnici;
	private JTextField textFieldUkupnaCenaSadnica;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjekatVinarija1 frame = new ProjekatVinarija1();
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
	public ProjekatVinarija1() {
		setTitle("Vinarija Lakicevic");
		setBackground(UIManager.getColor("Button.disabledForeground"));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1071, 623);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNaruci = new JButton("Naruci");
		btnNaruci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Kupac1 pi = new Kupac1();
				pi.setVisible(true);
				
			}
		});
		btnNaruci.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\ok.png"));
		btnNaruci.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnNaruci.setBounds(28, 297, 144, 23);
		contentPane.add(btnNaruci);
		
		JPanel panelProdaja = new JPanel();
		panelProdaja.setBackground(SystemColor.activeCaption);
		panelProdaja.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Prodaja vina", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelProdaja.setBounds(0, 12, 393, 575);
		contentPane.add(panelProdaja);
		panelProdaja.setLayout(null);
		
		JLabel lblVrstaVina = new JLabel("Vrsta vina:");
		lblVrstaVina.setBounds(22, 24, 97, 18);
		panelProdaja.add(lblVrstaVina);
		lblVrstaVina.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		final JComboBox comboBoxNazivVina = new JComboBox();
		comboBoxNazivVina.setBounds(251, 53, 112, 18);
		panelProdaja.add(comboBoxNazivVina);
		comboBoxNazivVina.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		final JComboBox comboBoxVrstaVina = new JComboBox();
		comboBoxVrstaVina.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxVrstaVina.getSelectedItem().equals("Belo")) {
					comboBoxNazivVina.addItem("Oriolus");
					comboBoxNazivVina.addItem("Upupa");
					comboBoxNazivVina.addItem("Picus");
					comboBoxNazivVina.addItem("Parus");
				}
				
				else if(comboBoxVrstaVina.getSelectedItem().equals("Crno")) {
					comboBoxNazivVina.removeAllItems();
					comboBoxNazivVina.addItem("Merula");
				}
				
			}
		});
		comboBoxVrstaVina.setBounds(251, 24, 112, 18);
		panelProdaja.add(comboBoxVrstaVina);
		comboBoxVrstaVina.setFont(new Font("Rockwell", Font.BOLD, 14));
		comboBoxVrstaVina.setModel(new DefaultComboBoxModel(new String[] {"Belo", "Crno"}));
		
		textFieldBrojFlasa = new JTextField();
		textFieldBrojFlasa.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBrojFlasa.setBounds(251, 82, 112, 18);
		panelProdaja.add(textFieldBrojFlasa);
		textFieldBrojFlasa.setFont(new Font("Rockwell", Font.BOLD, 14));
		textFieldBrojFlasa.setColumns(10);
		
		JButton btnCena = new JButton("Cena po flasi:");
		btnCena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxNazivVina.getSelectedItem().equals("Oriolus")) {
					textFieldCena.setText("1200.00 RSD");
				}
				else if(comboBoxNazivVina.getSelectedItem().equals("Picus")) {
					textFieldCena.setText("1800.00 RSD");
				}
				else if(comboBoxNazivVina.getSelectedItem().equals("Parus")) {
					textFieldCena.setText("1800.00 RSD");
				}
				else if(comboBoxNazivVina.getSelectedItem().equals("Upupa")) {
					textFieldCena.setText("1400.00 RSD");
				}
				else if(comboBoxNazivVina.getSelectedItem().equals("Merula")) {
					textFieldCena.setText("2400.00 RSD");
				}
				
			}
		});
		btnCena.setBackground(UIManager.getColor("Button.foreground"));
		btnCena.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\32435-bottle-with-popping-cork-icon.png"));
		btnCena.setForeground(Color.BLACK);
		btnCena.setBounds(102, 144, 175, 23);
		panelProdaja.add(btnCena);
		btnCena.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		JLabel lblNazivVina = new JLabel("Naziv vina:");
		lblNazivVina.setBounds(22, 53, 97, 18);
		panelProdaja.add(lblNazivVina);
		lblNazivVina.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		JLabel lblBrojFlasa = new JLabel("Broj flasa:");
		lblBrojFlasa.setBounds(22, 82, 97, 18);
		panelProdaja.add(lblBrojFlasa);
		lblBrojFlasa.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		textFieldCena = new JTextField();
		textFieldCena.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCena.setBounds(116, 178, 144, 20);
		panelProdaja.add(textFieldCena);
		textFieldCena.setFont(new Font("Rockwell", Font.BOLD, 14));
		textFieldCena.setColumns(10);
		
		JButton btnUkupnaCena = new JButton("Ukupna cena:");
		btnUkupnaCena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int brFlasa = Integer.parseInt(textFieldBrojFlasa.getText());
				double ukupno;
				
				if(comboBoxNazivVina.getSelectedItem().equals("Oriolus")) {
					ukupno = brFlasa * 1200;
					textFieldUkupnaCena.setText(" " + ukupno + " RSD");
				}
				
				else if(comboBoxNazivVina.getSelectedItem().equals("Picus")) {
					ukupno = brFlasa * 1800;
					textFieldUkupnaCena.setText(" " + ukupno + " RSD");
				}
				
				else if(comboBoxNazivVina.getSelectedItem().equals("Parus")) {
					ukupno = brFlasa * 1800;
					textFieldUkupnaCena.setText(" " + ukupno + " RSD");
				}
				
				else if(comboBoxNazivVina.getSelectedItem().equals("Upupa")) {
					ukupno = brFlasa * 1400;
					textFieldUkupnaCena.setText(" " + ukupno + " RSD");
				}
				
				else if(comboBoxNazivVina.getSelectedItem().equals("Merula")) {
					ukupno = brFlasa * 2400;
					textFieldUkupnaCena.setText(" " + ukupno + " RSD");
				}
				
			}
		});
		btnUkupnaCena.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\dollar-icon.png"));
		btnUkupnaCena.setBackground(UIManager.getColor("Button.background"));
		btnUkupnaCena.setForeground(Color.BLACK);
		btnUkupnaCena.setBounds(102, 209, 175, 23);
		panelProdaja.add(btnUkupnaCena);
		btnUkupnaCena.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		textFieldUkupnaCena = new JTextField();
		textFieldUkupnaCena.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUkupnaCena.setBounds(116, 243, 144, 20);
		panelProdaja.add(textFieldUkupnaCena);
		textFieldUkupnaCena.setFont(new Font("Rockwell", Font.BOLD, 14));
		textFieldUkupnaCena.setColumns(10);
		
		JButton btnDodaj = new JButton("Dodaj u korpu");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String vrsta = (String) comboBoxVrstaVina.getSelectedItem();
					String naziv = (String) comboBoxNazivVina.getSelectedItem();
					String cena = textFieldUkupnaCena.getText();
					
					Prodaja p = new Prodaja(vrsta, naziv, cena);
					lista.add(p);
					
					textFieldBrojFlasa.setText("");
					textFieldCena.setText("");
					textFieldUkupnaCena.setText("");
					
					JOptionPane.showMessageDialog(null, "Proizvod je uspesno dodat u korpu.");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
			}
		});
		btnDodaj.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\cart-add-icon.png"));
		btnDodaj.setBounds(215, 285, 168, 23);
		panelProdaja.add(btnDodaj);
		btnDodaj.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		JScrollPane scrollPaneKorpa = new JScrollPane();
		scrollPaneKorpa.setBounds(10, 372, 373, 145);
		panelProdaja.add(scrollPaneKorpa);
		
		final JTextArea textAreaIspisKorpe = new JTextArea();
		textAreaIspisKorpe.setFont(new Font("Rockwell", Font.BOLD, 14));
		scrollPaneKorpa.setViewportView(textAreaIspisKorpe);
		
		JButton btnMojaKorpa = new JButton("MOJA KORPA");
		btnMojaKorpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAreaIspisKorpe.setText("");
				
				for(int i=0; i<lista.size(); i++) {
					if(lista.size() == 0) {
						textAreaIspisKorpe.append("Korpa je prazna!");
					}
					else {
						textAreaIspisKorpe.append(lista.get(i).toString());
						textAreaIspisKorpe.append("\n\n");
					}
				}	
			}
		});
		btnMojaKorpa.setBounds(121, 332, 144, 23);
		panelProdaja.add(btnMojaKorpa);
		btnMojaKorpa.setBackground(UIManager.getColor("Button.background"));
		btnMojaKorpa.setForeground(Color.BLACK);
		btnMojaKorpa.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		JButton btnOcisti = new JButton("OCISTI KORPU");
		btnOcisti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0; i<lista.size(); i++) {
					lista.remove(i);
					textAreaIspisKorpe.setText("");
				}
				
			}
		});
		btnOcisti.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\Close-2-icon.png"));
		btnOcisti.setBounds(102, 541, 193, 23);
		panelProdaja.add(btnOcisti);
		btnOcisti.setFont(new Font("Rockwell", Font.BOLD, 14));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(403, 0, 644, 575);
		contentPane.add(tabbedPane);
		
		JPanel panelKatalog = new JPanel();
		tabbedPane.addTab("Pocetna", null, panelKatalog, null);
		panelKatalog.setBackground(SystemColor.activeCaption);
		panelKatalog.setLayout(null);
		
		JLabel lblNaslov = new JLabel("KATALOG");
		lblNaslov.setFont(new Font("Rockwell", Font.BOLD, 26));
		lblNaslov.setHorizontalAlignment(SwingConstants.CENTER);
		lblNaslov.setBounds(233, 32, 165, 35);
		panelKatalog.add(lblNaslov);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\logo (6).png"));
		lblLogo.setBounds(175, 78, 291, 458);
		panelKatalog.add(lblLogo);
		
		JPanel panelPregledVina = new JPanel();
		panelPregledVina.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Ponuda vina", null, panelPregledVina, null);
		panelPregledVina.setLayout(null);
		
		JScrollPane scrollPaneInfoVino = new JScrollPane();
		scrollPaneInfoVino.setBounds(20, 256, 584, 244);
		panelPregledVina.add(scrollPaneInfoVino);
		
		final JTextArea textAreaIspisOVinu = new JTextArea();
		textAreaIspisOVinu.setFont(new Font("Rockwell", Font.BOLD, 13));
		scrollPaneInfoVino.setViewportView(textAreaIspisOVinu);
		
		JButton btnOriolus = new JButton("");
		btnOriolus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAreaIspisOVinu.setText("");
				
				Oriolus o = new Oriolus("Oriolus", 1200);
				textAreaIspisOVinu.append(o.toString());
				
				
			}
		});
		btnOriolus.setForeground(SystemColor.activeCaption);
		btnOriolus.setBackground(SystemColor.activeCaption);
		btnOriolus.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\oriolus2019 (3).png"));
		btnOriolus.setBounds(20, 25, 89, 172);
		panelPregledVina.add(btnOriolus);
		
		JButton btnPicus = new JButton("");
		btnPicus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAreaIspisOVinu.setText("");
				
				Picus p = new Picus("Picus", 1800);
				textAreaIspisOVinu.append(p.toString());
				
			}
		});
		btnPicus.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\picus2019.png"));
		btnPicus.setBackground(SystemColor.activeCaption);
		btnPicus.setBounds(139, 25, 89, 172);
		panelPregledVina.add(btnPicus);
		
		JButton btnUpupa = new JButton("");
		btnUpupa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAreaIspisOVinu.setText("");
				
				Upupa u = new Upupa("Upupa", 1400);
				textAreaIspisOVinu.append(u.toString());
				
			}
		});
		btnUpupa.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\upupa2020.png"));
		btnUpupa.setBackground(SystemColor.activeCaption);
		btnUpupa.setBounds(265, 25, 89, 172);
		panelPregledVina.add(btnUpupa);
		
		JButton btnParus = new JButton("");
		btnParus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAreaIspisOVinu.setText("");
				
				Parus p = new Parus("Parus", 1800);
				textAreaIspisOVinu.append(p.toString());
				
			}
		});
		btnParus.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\parus2019.png"));
		btnParus.setBackground(SystemColor.activeCaption);
		btnParus.setBounds(383, 25, 89, 172);
		panelPregledVina.add(btnParus);
		
		JButton btnMerula = new JButton("");
		btnMerula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAreaIspisOVinu.setText("");
				
				Merula m = new Merula("Merula", 2400);
				textAreaIspisOVinu.append(m.toString());
				
			}
		});
		btnMerula.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\merula2019.png"));
		btnMerula.setBackground(SystemColor.activeCaption);
		btnMerula.setBounds(516, 25, 89, 172);
		panelPregledVina.add(btnMerula);
		
		JLabel lblOriolus = new JLabel("ORIOLUS");
		lblOriolus.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblOriolus.setHorizontalAlignment(SwingConstants.CENTER);
		lblOriolus.setBounds(20, 208, 89, 14);
		panelPregledVina.add(lblOriolus);
		
		JLabel lblPicus = new JLabel("PICUS");
		lblPicus.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicus.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblPicus.setBounds(139, 208, 89, 14);
		panelPregledVina.add(lblPicus);
		
		JLabel lblUpupa = new JLabel("UPUPA");
		lblUpupa.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpupa.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblUpupa.setBounds(265, 208, 89, 14);
		panelPregledVina.add(lblUpupa);
		
		JLabel lblParus = new JLabel("PARUS");
		lblParus.setHorizontalAlignment(SwingConstants.CENTER);
		lblParus.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblParus.setBounds(383, 210, 89, 14);
		panelPregledVina.add(lblParus);
		
		JLabel lblMerula = new JLabel("MERULA");
		lblMerula.setHorizontalAlignment(SwingConstants.CENTER);
		lblMerula.setFont(new Font("Rockwell", Font.BOLD, 16));
		lblMerula.setBounds(518, 210, 89, 14);
		panelPregledVina.add(lblMerula);
		
		JLabel lblNewLabel = new JLabel("➡️ Kliknuti na zeljenu flasu za pregled!");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(20, 522, 265, 14);
		panelPregledVina.add(lblNewLabel);
		
		JPanel panelProdajaSadnica = new JPanel();
		panelProdajaSadnica.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Prodaja sadnica", null, panelProdajaSadnica, null);
		panelProdajaSadnica.setLayout(null);
		
		JLabel lblProdajaSadnica = new JLabel("PRODAJA SADNICA");
		lblProdajaSadnica.setFont(new Font("Rockwell", Font.BOLD, 26));
		lblProdajaSadnica.setBounds(184, 34, 273, 31);
		panelProdajaSadnica.add(lblProdajaSadnica);
		
		JLabel lblVrstaSorte = new JLabel("Vrsta sorte:");
		lblVrstaSorte.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblVrstaSorte.setBounds(38, 109, 97, 18);
		panelProdajaSadnica.add(lblVrstaSorte);
		
		JLabel lblNazivSorte = new JLabel("Naziv sorte:");
		lblNazivSorte.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblNazivSorte.setBounds(38, 150, 97, 18);
		panelProdajaSadnica.add(lblNazivSorte);
		
		JLabel lblBrojSadnica = new JLabel("Broj sadnica:");
		lblBrojSadnica.setFont(new Font("Rockwell", Font.BOLD, 14));
		lblBrojSadnica.setBounds(38, 193, 97, 18);
		panelProdajaSadnica.add(lblBrojSadnica);
		
		final JComboBox comboBoxNazivSorte = new JComboBox();
		comboBoxNazivSorte.setFont(new Font("Rockwell", Font.BOLD, 14));
		comboBoxNazivSorte.setBounds(145, 149, 183, 22);
		panelProdajaSadnica.add(comboBoxNazivSorte);
		
		final JComboBox comboBoxVrstaSorte = new JComboBox();
		comboBoxVrstaSorte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxVrstaSorte.getSelectedItem().equals("Bela")) {
					comboBoxNazivSorte.addItem("Chardonnay");
					comboBoxNazivSorte.addItem("Sauvignon blanc");
					comboBoxNazivSorte.addItem("Viogner");
					comboBoxNazivSorte.addItem("Solaris");
					comboBoxNazivSorte.addItem("Tamjanika");
				}
				else if(comboBoxVrstaSorte.getSelectedItem().equals("Crna")) {
					comboBoxNazivSorte.removeAllItems();
					comboBoxNazivSorte.addItem("Caberne franc");
					comboBoxNazivSorte.addItem("Cabernet sauvignon");
					comboBoxNazivSorte.addItem("Malbec");
				}
				
			}
		});
		comboBoxVrstaSorte.setFont(new Font("Rockwell", Font.BOLD, 14));
		comboBoxVrstaSorte.setModel(new DefaultComboBoxModel(new String[] {"Bela", "Crna"}));
		comboBoxVrstaSorte.setBounds(184, 108, 97, 22);
		panelProdajaSadnica.add(comboBoxVrstaSorte);
		
		textFieldBrojSadnica = new JTextField();
		textFieldBrojSadnica.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBrojSadnica.setFont(new Font("Rockwell", Font.BOLD, 14));
		textFieldBrojSadnica.setColumns(10);
		textFieldBrojSadnica.setBounds(184, 193, 97, 18);
		panelProdajaSadnica.add(textFieldBrojSadnica);
		
		JButton btnCenaSadnice = new JButton("Cena po sadnici:");
		btnCenaSadnice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBoxNazivSorte.getSelectedItem().equals("Chardonnay")) {
					textFieldCenaPoSadnici.setText("100.00 RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Sauvignon blanc")) {
					textFieldCenaPoSadnici.setText("120.00 RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Viogner")) {
					textFieldCenaPoSadnici.setText("110.00 RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Solaris")) {
					textFieldCenaPoSadnici.setText("120.00 RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Tamjanika")) {
					textFieldCenaPoSadnici.setText("92.00 RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Caberne franc")) {
					textFieldCenaPoSadnici.setText("110.00 RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Cabernet sauvignon")) {
					textFieldCenaPoSadnici.setText("150.00 RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Malbec")) {
					textFieldCenaPoSadnici.setText("95.00 RSD");
				}
				
			}
		});
		btnCenaSadnice.setForeground(Color.BLACK);
		btnCenaSadnice.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnCenaSadnice.setBackground(new Color(255, 255, 255));
		btnCenaSadnice.setBounds(140, 245, 175, 23);
		panelProdajaSadnica.add(btnCenaSadnice);
		
		JButton btnUkupnaCena_2 = new JButton("Ukupna cena:");
		btnUkupnaCena_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int brSadnica = Integer.parseInt(textFieldBrojSadnica.getText());
				double ukupno;
				
				if(comboBoxNazivSorte.getSelectedItem().equals("Chardonnay")) {
					ukupno = brSadnica * 100;
					textFieldUkupnaCenaSadnica.setText(" " + ukupno + " RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Sauvignon blanc")) {
					ukupno = brSadnica * 120;
					textFieldUkupnaCenaSadnica.setText(" " + ukupno + " RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Viogner")) {
					ukupno = brSadnica * 110;
					textFieldUkupnaCenaSadnica.setText(" " + ukupno + " RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Solaris")) {
					ukupno = brSadnica * 120;
					textFieldUkupnaCenaSadnica.setText(" " + ukupno + " RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Tamjanika")) {
					ukupno = brSadnica * 92;
					textFieldUkupnaCenaSadnica.setText(" " + ukupno + " RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Caberne franc")) {
					ukupno = brSadnica * 110;
					textFieldUkupnaCenaSadnica.setText(" " + ukupno + " RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Cabernet sauvignon")) {
					ukupno = brSadnica * 150;
					textFieldUkupnaCenaSadnica.setText(" " + ukupno + " RSD");
				}
				else if(comboBoxNazivSorte.getSelectedItem().equals("Malbec")) {
					ukupno = brSadnica * 95;
					textFieldUkupnaCenaSadnica.setText(" " + ukupno + " RSD");
				}
			}
		});
		btnUkupnaCena_2.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\dollar-icon.png"));
		btnUkupnaCena_2.setForeground(Color.BLACK);
		btnUkupnaCena_2.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnUkupnaCena_2.setBackground(SystemColor.menu);
		btnUkupnaCena_2.setBounds(140, 310, 175, 23);
		panelProdajaSadnica.add(btnUkupnaCena_2);
		
		textFieldCenaPoSadnici = new JTextField();
		textFieldCenaPoSadnici.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCenaPoSadnici.setFont(new Font("Rockwell", Font.BOLD, 14));
		textFieldCenaPoSadnici.setColumns(10);
		textFieldCenaPoSadnici.setBounds(160, 279, 144, 20);
		panelProdajaSadnica.add(textFieldCenaPoSadnici);
		
		textFieldUkupnaCenaSadnica = new JTextField();
		textFieldUkupnaCenaSadnica.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUkupnaCenaSadnica.setFont(new Font("Rockwell", Font.BOLD, 14));
		textFieldUkupnaCenaSadnica.setColumns(10);
		textFieldUkupnaCenaSadnica.setBounds(160, 344, 144, 20);
		panelProdajaSadnica.add(textFieldUkupnaCenaSadnica);
		
		JButton btnNaruci_2 = new JButton("Naruci");
		btnNaruci_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Kupac1 pi = new Kupac1();
				pi.setVisible(true);
				
			}
		});
		btnNaruci_2.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\ok.png"));
		btnNaruci_2.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnNaruci_2.setBounds(38, 402, 144, 23);
		panelProdajaSadnica.add(btnNaruci_2);
		
		JButton btnDodaj_2 = new JButton("Dodaj u korpu");
		btnDodaj_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String vrsta = (String) comboBoxVrstaSorte.getSelectedItem();
					String naziv = (String) comboBoxNazivSorte.getSelectedItem();
					String cena = textFieldUkupnaCenaSadnica.getText();
					
					Prodaja_sadnica p = new Prodaja_sadnica(vrsta, naziv, cena);
					lista2.add(p);
					
					textFieldBrojSadnica.setText("");
					textFieldCenaPoSadnici.setText("");
					textFieldUkupnaCenaSadnica.setText("");
					
					JOptionPane.showMessageDialog(null, "Proizvod je uspesno dodat u korpu.");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnDodaj_2.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\cart-add-icon.png"));
		btnDodaj_2.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnDodaj_2.setBounds(219, 403, 168, 23);
		panelProdajaSadnica.add(btnDodaj_2);
		
		JScrollPane scrollPaneIspisSadnica = new JScrollPane();
		scrollPaneIspisSadnica.setBounds(384, 126, 245, 238);
		panelProdajaSadnica.add(scrollPaneIspisSadnica);
		
		final JTextArea textAreaIspisSadnica = new JTextArea();
		textAreaIspisSadnica.setFont(new Font("Rockwell", Font.BOLD, 14));
		scrollPaneIspisSadnica.setViewportView(textAreaIspisSadnica);
		
		JButton btnMojaKorpa_2 = new JButton("MOJA KORPA");
		btnMojaKorpa_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textAreaIspisSadnica.setText("");
				
				for(int i=0; i<lista2.size(); i++) {
					if(lista2.size() == 0) {
						textAreaIspisSadnica.append("Korpa je prazna");
					}
					else {
						textAreaIspisSadnica.append(lista2.get(i).toString());
						textAreaIspisSadnica.append("\n\n");
					}
				}
				
			}
		});
		btnMojaKorpa_2.setForeground(Color.BLACK);
		btnMojaKorpa_2.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnMojaKorpa_2.setBackground(SystemColor.menu);
		btnMojaKorpa_2.setBounds(433, 93, 161, 23);
		panelProdajaSadnica.add(btnMojaKorpa_2);
		
		JButton btnOcisti_2 = new JButton("OCISTI KORPU");
		btnOcisti_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i=0; i<lista2.size(); i++) {
					lista2.remove(i);
					textAreaIspisSadnica.setText("");
				}
				
			}
		});
		btnOcisti_2.setIcon(new ImageIcon("D:\\Workspace\\Projekat_Vinarija\\img\\Close-2-icon.png"));
		btnOcisti_2.setFont(new Font("Rockwell", Font.BOLD, 14));
		btnOcisti_2.setBounds(433, 377, 168, 23);
		panelProdajaSadnica.add(btnOcisti_2);
		

		
	}
}

