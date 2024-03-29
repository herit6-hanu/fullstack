window.addEventListener("load", () => {
    var lat, long;
    navigator.geolocation.getCurrentPosition((position) => {
        lat = position.coords.latitude;
        long = position.coords.longitude;
        let apiKey = "Fy5RZKOJwiuwXnB8ciiMqAHyz9mASA4v&q";
        let obj = axios.get(`http://dataservice.accuweather.com/locations/v1/cities/geoposition/search?apikey=${apiKey}=${lat}%2C${long}`).then((resposne) => {
            let dataKey = resposne.data.Key;
            axios.get(`http://dataservice.accuweather.com/forecasts/v1/daily/1day/${dataKey}?apikey=${apiKey}`).then((anotherResponse) => {
                console.log(anotherResponse);
            });
        });
        setTimeout(() => {
            console.log(obj);
        },3000)
    });
});
