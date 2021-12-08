package zuul2;

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
    private Room northExit;
    private Room southExit;
    private Room eastExit;
    private Room westExit;
    private Room upExit;
    private Room downExit;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description) 
    {
        this.description = description;
    }

    public Room getExit(String direction){
        /*switch (direction) {
            // Wenn "direction" Norden ist, dann gib Raum "northExit" zurück.
            case "north" : return northExit;
            // Wenn "direction" Osten ist, dann gib Raum "eastExit" zurück.
            case "east" : return eastExit;
            case "south" : return southExit;
            case "west" : return westExit;
            case "up" : return upExit;
            case "down" : return downExit;
            default : return null;*/

        if(direction.equalsIgnoreCase("north")){
            return northExit;
        }
        if(direction.equalsIgnoreCase("east")){
            return eastExit;
        }
        if(direction.equalsIgnoreCase("south")){
            return southExit;
        }
        if(direction.equalsIgnoreCase("west")){
            return westExit;
        }
        if(direction.equalsIgnoreCase("up")){
            return upExit;
        }
        if(direction.equalsIgnoreCase("down")){
            return downExit;
        }
        return null;
    }

    public String exitsToString(){
        StringBuilder stringBuilder = new StringBuilder();
        Room[] rooms = {northExit, southExit, eastExit, westExit, upExit, downExit};
        String[] labels= {"north" , "south", "east", "west", "up", "down"};
        for(int i=0;i< rooms.length;i++) {
            Room room=rooms[i];
            if (room != null) {
                stringBuilder.append(labels[i]);
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     * @param north The north exit.
     * @param east The east east.
     * @param south The south exit.
     * @param west The west exit.
     */
    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down)
    {
        if(north != null) {
            northExit = north;
        }
        if(east != null) {
            eastExit = east;
        }
        if(south != null) {
            southExit = south;
        }
        if(west != null) {
            westExit = west;
        }
        if(up != null) {
            upExit = up;
        }
        if(down != null) {
            downExit = down;
        }
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
