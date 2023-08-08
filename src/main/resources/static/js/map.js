var map;

function initMap() {
  var gyeongbokgung = { lat: 37.559212, lng: 126.860926 };
  map = new google.maps.Map( document.getElementById('map'), {
      zoom: 15,
      center: gyeongbokgung
    });

  var subMarkerPoint = { lat: 37.559212, lng: 126.860926};
  var subMarker = new google.maps.Marker({
      position: subMarkerPoint,
      map: map,
      label: "굿씽크",
      icon: {
        url: "http://maps.google.com/mapfiles/ms/icons/red-dot.png",
        labelOrigin: new google.maps.Point(20, 47),
        anchor: new google.maps.Point(50,32)
      }
    });
}

function changeCenter() {
  var gyeongbokgung = { lat: 37.57979553563185, lng: 126.97706245552442 };
  map.panTo(gyeongbokgung);
  map.setZoom(15);
}