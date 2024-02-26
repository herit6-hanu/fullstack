//topic about named function

function dogSounds() {
  console.log("bow... bow...");
}

//call the named function with zero parameters

dogSounds();

function animalSounds(animalname) {
  if (animalname == "Dog") {
    console.log("bow... bow...");
  }
  else if (animalname == "Cat") {
    console.log("meow...meow...");
  }
  else {
    console.log("Given name is not considered as animal")
  }
}

animalSounds("Dog");
