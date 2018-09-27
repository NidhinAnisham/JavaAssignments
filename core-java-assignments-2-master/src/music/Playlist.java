/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

import java.util.Scanner;

/**
 *
 * @author NI389899
 */
public class Playlist {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of playlist: ");
        String name = in.nextLine();
        System.out.print("Enter number of songs: ");
        int no = in.nextInt();
        in.nextLine();
        System.out.print("Enter song type(Jazz,Rock,Ghazal): ");
        String type = in.nextLine().toLowerCase();
        Jazz[] play1 = new Jazz[no];
        Rock[] play2 = new Rock[no];
        Ghazal[] play3 = new Ghazal[no];
        if(type.equals("jazz")){
            for(int i=0;i<no;i++){
                play1[i] = new Jazz();
                System.out.print("Enter song name: ");
                play1[i].setSongName(in.nextLine());
                System.out.print("Enter duration in seconds: ");
                play1[i].setDuration(in.nextInt());
            }
        }
        else if(type.equals("rock")){           
            for(int i=0;i<no;i++){
                play2[i] = new Rock();
                System.out.print("Enter song name: ");
                play2[i].setSongName(in.nextLine());
                System.out.print("Enter duration in seconds: ");
                play2[i].setDuration(in.nextInt());
                in.nextLine();
            }
        }
        else if(type.equals("ghazal")){           
            for(int i=0;i<no;i++){
                play3[i] = new Ghazal();
                System.out.print("Enter song name: ");
                play3[i].setSongName(in.nextLine());
                System.out.print("Enter duration in seconds: ");
                play3[i].setDuration(in.nextInt());
            }
        }
        else
            System.out.println("Invalid");        
        
        System.out.println("Playlist: "+name);
        switch (type) {
            case "jazz":
                for(int i=0;i<no;i++)
                    play1[i].Play();
                break;
            case "rock":
                for(int i=0;i<no;i++)
                    play2[i].Play();
                break;
            case "ghazal":
                for(int i=0;i<no;i++)
                    play3[i].Play();
                break;
            default:
                break;
        }
    }
}
