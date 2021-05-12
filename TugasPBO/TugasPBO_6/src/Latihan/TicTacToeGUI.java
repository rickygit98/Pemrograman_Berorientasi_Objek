/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author User
 */
public class TicTacToeGUI extends JFrame {
    
    // inisiasi variable variable object yang dibutuhkan
    // untuk tipe datanya adalah object yang sudah dibuatkan dari JFrame
    private Container pane;
    private String currentPlayer;
    private JButton [][] board;
    private boolean hasWinner;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem quit;
    private JMenuItem newGame;
    
    //Constructor
    // Menyusun nilai default untuk component dan frame
    public TicTacToeGUI(){
        super();
        pane = getContentPane();
        pane.setLayout(new GridLayout (3,3));
        setTitle("Tic Tac Toe Game");
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        currentPlayer = "X";
        board = new JButton [3][3];
        hasWinner = false;
        initiateBoard();
        initiateMenuBar();   
        
    }
    
    //Method
    
    //Membuat menubar
    //sementara yang sederhana saja file untuk new game dan quit
    private void initiateMenuBar(){
        
        //buat object JMenubar dan JMenu
        menuBar = new JMenuBar();
        menu = new JMenu ("File");
        
        //buat JMenuItem
        newGame = new JMenuItem ("New Game");
        newGame.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                resetBoard();
            }
        });
        
        quit = new JMenuItem ("Quit");
        quit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        //tambahkan menu itemnya ke menu bar
        menu.add(newGame);
        menu.add(quit);
        menuBar.add(menu);
        setJMenuBar(menuBar);
 
    }
    
    
    //Method reset board untuk new game
    private void resetBoard(){
        currentPlayer = "X";
        hasWinner = false;
        for(int i =0 ; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board [i][j].setText("");
            }
        }
    }
    
    //Method initiate board , untuk tiap kolom yang bila diklik
    //tiap diklik akan mengeluarkan huruf X atau O sesuai player saat ini
    //Player saat ini diatur dengan method toggle player
    private void initiateBoard(){
        for (int i = 0; i <3 ; i++){
            for(int j = 0; j<3;j++){
                JButton btn = new JButton ("");
                btn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,100));
                board[i][j] = btn;
                btn.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                       if(((JButton)e.getSource()).getText().equals ("") && hasWinner == false){
                           btn.setText(currentPlayer);
                           //Memanggil method hasWinner dan toggle player untuk gantian pemain
                           hasWinner();
                           togglePlayer();
                       }
                    }
                });
                pane.add(btn);
            }
        }
    }
    
    //Mengatur perpindahan dari satu player ke player kedua dan sebaliknya
    private void togglePlayer(){
        if(currentPlayer.equals("X")){
            currentPlayer = "O";
        }
        else{
            currentPlayer = "X";
        }
    }
    
    //Algoritma untuk mengecek menang kalah
    private void hasWinner(){
        if(board[0][0].getText().equals(currentPlayer) && board[1][0].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        }
        else if(board[0][1].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        }
        else if(board[0][2].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        }
        else if(board[0][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        }
        else if(board[0][2].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[2][0].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        }
        else if(board[0][0].getText().equals(currentPlayer) && board[0][1].getText().equals(currentPlayer) && board[0][2].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        }
        else if(board[1][0].getText().equals(currentPlayer) && board[1][1].getText().equals(currentPlayer) && board[1][2].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        }
        else if(board[2][0].getText().equals(currentPlayer) && board[2][1].getText().equals(currentPlayer) && board[2][2].getText().equals(currentPlayer)) {
            JOptionPane.showMessageDialog(null, "Player " + currentPlayer + " has won");
            hasWinner = true;
        }
        
    }
}
