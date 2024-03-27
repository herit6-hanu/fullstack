window.addEventListener("load", () => {
    var lat, long;
    navigator.geolocation.getCurrentPosition((position) => {
        lat = position.coords.latitude;
        long = position.coords.longitude;
        
        // Replace 'YOUR_API_KEY' with your actual AccuWeather API key
        const apiKey = 'Fy5RZKOJwiuwXnB8ciiMqAHyz9mASA4v';
        
        // Construct the URL for the AccuWeather API endpoint
        const apiUrl = `https://developer.accuweather.com/accuweather-forecast-api/apis/get/forecasts/v1/hourly/1hour/%7BlocationKey%7Dhttp://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=${apiKey}&q=${lat}%20%2C${long}`;

        fetch(apiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(data => {
            console.log(data);
            // Handle the weather data here
        })
        .catch(error => {
            console.error('Error:', error);
        });
    });
});
