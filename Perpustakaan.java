package UAS;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Perpustakaan {

	private JFrame frmPerpustakaan;
	private JTextField nama;
	private JTextField nim;
	private JTextField kobu;
	private JTextArea hasil;
	ArrayList<Hasil> perpus = new ArrayList<Hasil>();
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Perpustakaan window = new Perpustakaan();
					window.frmPerpustakaan.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Perpustakaan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPerpustakaan = new JFrame();
		frmPerpustakaan.setTitle("Perpustakaan");
		frmPerpustakaan.setBounds(100, 100, 809, 417);
		frmPerpustakaan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPerpustakaan.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Data Peminjaman Buku");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(64, 11, 180, 20);
		frmPerpustakaan.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nama");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 70, 41, 14);
		frmPerpustakaan.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("NIM");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 134, 46, 14);
		frmPerpustakaan.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Kode Buku");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 189, 75, 14);
		frmPerpustakaan.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Tanggal Pinjam");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(10, 245, 96, 14);
		frmPerpustakaan.getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Tanggal Kembali");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(10, 305, 108, 14);
		frmPerpustakaan.getContentPane().add(lblNewLabel_5);

		JComboBox tglph = new JComboBox();
		tglph.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tglph.setModel(new DefaultComboBoxModel(new String[] { "Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		tglph.setBounds(130, 242, 65, 22);
		frmPerpustakaan.getContentPane().add(tglph);

		JComboBox tglpb = new JComboBox();
		tglpb.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tglpb.setModel(new DefaultComboBoxModel(new String[] { "Bulan", "Januari", "Februari", "Maret", "April", "Mei",
				"Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
		tglpb.setBounds(230, 242, 80, 22);
		frmPerpustakaan.getContentPane().add(tglpb);

		JComboBox tglpt = new JComboBox();
		tglpt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tglpt.setModel(new DefaultComboBoxModel(new String[] { "Tahun", "2021", "2022", "2023" }));
		tglpt.setBounds(328, 242, 75, 22);
		frmPerpustakaan.getContentPane().add(tglpt);

		JComboBox tglkh = new JComboBox();
		tglkh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tglkh.setModel(new DefaultComboBoxModel(new String[] { "Tanggal", "1", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
				"27", "28", "29", "30", "31" }));
		tglkh.setBounds(130, 302, 75, 22);
		frmPerpustakaan.getContentPane().add(tglkh);

		JComboBox tglkb = new JComboBox();
		tglkb.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tglkb.setModel(new DefaultComboBoxModel(new String[] { "Bulan", "Januari", "Februari", "Maret", "April", "Mei",
				"Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
		tglkb.setBounds(230, 302, 80, 22);
		frmPerpustakaan.getContentPane().add(tglkb);

		JComboBox tglkt = new JComboBox();
		tglkt.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tglkt.setModel(new DefaultComboBoxModel(new String[] { "Tahun", "2021", "2022", "2023" }));
		tglkt.setBounds(328, 302, 75, 22);
		frmPerpustakaan.getContentPane().add(tglkt);

		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nm = nama.getText();
				String ni = nim.getText();
				String kb = kobu.getText();

				String t = tglph.getSelectedItem().toString();
				String b = tglpb.getSelectedItem().toString();
				String th = tglpt.getSelectedItem().toString();

				String t1 = tglkh.getSelectedItem().toString();
				String b1 = tglkb.getSelectedItem().toString();
				String th1 = tglkt.getSelectedItem().toString();

				Hasil isi = (new Hasil(nm, ni, kb, t, b, th, t1, b1, th1));
				perpus.add(isi);
				for (int i = 0; i < perpus.size(); i++) {
					String oi = ("+===================================+"+"\n> Nama : " + perpus.get(i).nama + "\n> NIM : " + perpus.get(i).nim
							+ "\n> Kode Buku : " + perpus.get(i).kode_buku + "\n> Tanggal Sewa : "
							+ perpus.get(i).tanggalph + " - " + perpus.get(i).tanggalpb + " - "
							+ perpus.get(i).tanggalpt + "\n> Tanggal Kembali : " + perpus.get(i).tanggalkh + " - "
							+ perpus.get(i).tanggalkb + " - " + perpus.get(i).tanggalkt+"\n+===================================+");
							hasil.setText(oi);
				}
			}
		});
		
	
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(490, 288, 100, 49);
		frmPerpustakaan.getContentPane().add(btnNewButton);

		nama = new JTextField();
		nama.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		nama.setBounds(130, 68, 180, 20);
		frmPerpustakaan.getContentPane().add(nama);
		nama.setColumns(10);

		nim = new JTextField();
		nim.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		nim.setBounds(130, 132, 120, 20);
		frmPerpustakaan.getContentPane().add(nim);
		nim.setColumns(10);

		kobu = new JTextField();
		kobu.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		kobu.setBounds(130, 187, 46, 20);
		frmPerpustakaan.getContentPane().add(kobu);
		kobu.setColumns(10);

		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hasil.setRows(0);
				hasil.setText(null);
			
				
			}
		});
		delete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		delete.setBounds(651, 288, 96, 49);
		frmPerpustakaan.getContentPane().add(delete);
				
						hasil = new JTextArea();
						hasil.setEditable(false);
						hasil.setBackground(Color.LIGHT_GRAY);
						hasil.setForeground(Color.BLACK);
						hasil.setBounds(490, 51, 257, 208);
						frmPerpustakaan.getContentPane().add(hasil);
						hasil.setColumns(10);
	}
}













