let chance = require('chance').Chance();

console.log(chance.email());
console.log(chance.email({domain: "rv.com"}));
console.log(chance.word({length:6}));
console.log(chance.first()); // first name
console.log(chance.city());
console.log(chance.sentence({words: 3}));
