package de.szut.zuul;

import java.util.HashMap;

/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */
public class Room 
{
    private String description;
    /*private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private Room upExit;
    private Room downExit;*/
    private HashMap<String, Room> exit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
        this.exit = new HashMap<>();
    }

    public Room getExit(String direction){

        return this.exit.get(direction);
    }

    public String exitsToString(){
        String text = " ";
        for(String exits : exit.keySet()){
            text += exits + " ";
        }
        return text;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param "north The north exit.
     * @param "east The east east.
     * @param "south The south exit.
     * @param "west The west exit.
     */

    public  void setExit(String direction, Room neighbour){
        this.exit.put(direction, neighbour);
    }


    public String getLongDescription(){
        String text = "\n";
        text += "You are " + getDescription() + "\n";
        text += "Exits: ";
        text += exitsToString();
        System.out.println(text);

        return text;

        /*System.out.println();
        System.out.println("You are " + getDescription());
        System.out.print("Exits: ");
        System.out.println(exitsToString());*/
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
