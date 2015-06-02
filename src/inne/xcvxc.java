package fgf;

public class xcvxc {

int tab [] = new int [10]; // tablica " tab " 
int min;
int max; 
{
tab[0] = 99; 
tab[1] = -10; 

min = max = tab[0]; 

for(int i = 1; i < 10; i++) { 

if(tab[i] < min) min = tab[i]; 
if(tab[i] > max) max = tab[i]; 
} 

System.out.println(" min i max: " + min + " " + max); 



}
	
}
