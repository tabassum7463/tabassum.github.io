function generatePlaylist() {
    var mood = document.getElementById("mood").value;
    var playlistContainer = document.getElementById("playlist");

    // You can customize the playlist based on different moods
    var playlist = getPlaylistForMood(mood);

    // Display the generated playlist
    playlistContainer.innerHTML = "<h2>Your Playlist:</h2>" + playlist.join("<br>");
}

function getPlaylistForMood(mood) {
    switch (mood) {
        case "happy":
            return ["Happier", "Tick tock", "Dance the night away"];
        case "sad":
            return ["August ","What was i made for","Easy on me"];
        case "energetic":
            return [ "Barbie girl", "Blinding lights","Wannabe"];
        case "romantic":
            return ["Lover", "We fell in love in october", "Juliet"];
        
        // Add more cases for other moods
        default:
            return ["No playlist available for this mood."];
    }
}