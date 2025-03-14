/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bubblesort;

/**
 *
 * @author EThornbury
 */
import java.util.ArrayList;

public class MyArrayList<ElemType> extends ArrayList<ElemType>{

	public void betterBubble(){
		Comparable elemAtJ;  //making use of the Comparable interface
		Comparable elemAtJplus;

		for(int i = 0; i < size(); i++){
			for(int j = 0; j < size()-1-i; j++){
				elemAtJ = (Comparable)get(j); //getting the items at the required indexes
				elemAtJplus = (Comparable)get(j+1); //casting them to compare them

				if(  elemAtJ.compareTo(elemAtJplus)  >0 ){
					swap(j, j+1); //you write that method
				}

			}
		}
	}

	//swap method based on the pseudocode from notes for the Solution 
	private void swap(int position1, int position2){
		//temp holders for elements
		//remove and add your elements to the correct positions
		ElemType tempObj1 = get(position1);
                ElemType tempObj2 = get(position2);
                remove(position1);
                add(position1, tempObj2);
                remove(position2);
                add(position2, tempObj1);
	}


	public void simpleBubble(){ //method based on the pseudo code in the notes
		//write this based on the pseudocode in the lecture notes
            boolean moreSwaps = true;
            while(moreSwaps = true){
                moreSwaps = false;
                for(int x = 0; x <size(); x++){  //iterating over the collection
                    Comparable elemAtX = (Comparable)get(x);
                    Comparable elemAtXplus = (Comparable)get(x+1);
                    
                    if(elemAtX.compareTo(elemAtXplus) > 0){
                        swap(x, x+1);
                        moreSwaps = true;
                    }
                }
            }
	}
}