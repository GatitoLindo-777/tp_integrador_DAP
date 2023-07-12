package com.example.tp_integrador

import androidx.lifecycle.ViewModel

        class SharedViewModel : ViewModel() {
    val position =0
    //var GamesList : MutableList<Games> = mutableListOf ()
    var GamesList : MutableList<Games> = mutableListOf()
    init{
        GamesList.add(Games("CS:GO", "9.5/10", "The game pits two teams, Terrorists and Counter-Terrorists, against each other in different objective-based game modes. The most common game modes involve the Terrorists planting a bomb while Counter-Terrorists attempt to stop them, or Counter-Terrorists attempting to rescue hostages that the Terrorists have captured.", "https://wiki.rpcs3.net/images/thumb/7/77/CSGO.jpg/630px-CSGO.jpg"))
            GamesList.add(Games("Hollow Knight", "9/10", "Hollow Knight is a classically styled 2D action adventure across a vast interconnected world. Explore twisting caverns, ancient cities and deadly wastes; battle tainted creatures and befriend bizarre bugs; and solve ancient mysteries at the kingdom's heart.", "https://d2uym1p5obf9p8.cloudfront.net/images/games/5a6129c97f5f7"))
                GamesList.add(Games("Cup Head", "8/10", "Cuphead is a classic run and gun action game heavily focused on boss battles. Inspired by cartoons of the 1930s, the visuals and audio are painstakingly created with the same techniques of the era: traditional hand drawn cel animation, watercolor backgrounds, and original jazz recordings.","https://steamuserimages-a.akamaihd.net/ugc/872993851258114993/A0DC6AD0C9B7F5178F87A8199A138C0124E999C5/?imw=5000&imh=5000&ima=fit&impolicy=Letterbox&imcolor=%23000000&letterbox=false"))
                    GamesList.add(Games("Among Us", "6/10", "Among Us is a multiplayer game where 10 players get dropped into an alien spaceship, sky headquarters or planet base, where each player is designated with a private role of either a “crewmate” and an “impostor.” This is an online multiplayer social deduction game, and a player can either be a crewmate or an imposter.", "https://static.wikia.nocookie.net/among-us-wiki/images/8/84/Among_Us.png/revision/latest?cb=20210708211841"))
                        GamesList.add(Games("VALORANT", "8.5/10", "Valorant is a team-based first-person tactical hero shooter set in the near future. Players play as one of a set of Agents, characters based on several countries and cultures around the world. In the main game mode, players are assigned to either the attacking or defending team with each team having five players on it.", "https://thumbs.dreamstime.com/b/valorant-game-logo-symbol-isolated-white-background-vector-eps-190964521.jpg"))
                            GamesList.add(Games("Golf it!", "8/10", "Golf It! is a multiplayer Minigolf game with focus on a dynamic, fun and creative multiplayer experience. One of the most exciting features is a Multiplayer Editor, where you can build and play custom maps together with your friends. Every map has unique gameplay features and different aesthetics.", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR0dxaYY36ibsHRTTtaTN54Bg016sO41nEn40A6g3pMl848Ac2293K_XqsmtbPorhsDI_U&usqp=CAU"))
         GamesList.add(Games("Sea of Thives", "9/10", "The multiplayer game sees players explore an open world via a pirate ship from a first-person perspective. Groups of players encounter each other regularly during their adventures, sometimes forming alliances, and sometimes going head-to-head. Sea of Thieves was conceived in 2014.", "https://store-images.s-microsoft.com/image/apps.21319.14554784103656548.6c0bfca6-ceff-4368-9bde-2fe50f344136.c8d6c767-18a9-49cd-b9ca-4cc9a3a336e5"))
        GamesList.add(Games("DOOM", "10/10", "In Doom, players assume the role of an unnamed space marine, who became popularly nicknamed \"Doomguy\" by the community before being retconned as Doom Slayer, fighting his way through hordes of invading demons from Hell.", "https://i.pinimg.com/originals/bf/23/49/bf2349d574dc7fec2e5a70bd9cffef9c.jpg"),)
    }
    //fun getGames () : MutableList<Games>{ return GamesList }


    var userData: MutableList<User> = mutableListOf()

}