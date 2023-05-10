const passwordInput = document.getElementById('password2');
const lengthIcon = document.getElementById('length-icon');
const lowercaseIcon = document.getElementById('lowercase-icon');
const uppercaseIcon = document.getElementById('uppercase-icon');
const numberIcon = document.getElementById('number-icon');
const specialCharIcon = document.getElementById('special-char-icon');

passwordInput.addEventListener('input', () => {
  const password = passwordInput.value;

  if (password.length < 8 || password.length > 16) {
    lengthIcon.src = 'images/X.png';
  } else {
    lengthIcon.src = 'images/tick.png';
  }

  if (!password.match(/[a-z]/)) {
    lowercaseIcon.src = 'images/X.png';
  } else {
    lowercaseIcon.src = 'images/tick.png';
  }

  if (!password.match(/[A-Z]/)) {
    uppercaseIcon.src = 'images/X.png';
  } else {
    uppercaseIcon.src = 'images/tick.png';
  }

  if (!password.match(/\d/)) {
    numberIcon.src = 'images/X.png';
  } else {
    numberIcon.src = 'images/tick.png';
  }

  if (!password.match(/[#$@!%&*?_]/)) {
    specialCharIcon.src = 'images/X.png';
  } else {
    specialCharIcon.src = 'images/tick.png';
  }
});
