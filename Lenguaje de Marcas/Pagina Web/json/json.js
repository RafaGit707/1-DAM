const passwordInput = document.getElementById('password');
const errorMessage = document.getElementById('error_message');

passwordInput.addEventListener('input', () => {
  const password = passwordInput.value;

  if (password.length < 8 || password.length > 16) {
    errorMessage.textContent = 'La contraseña debe tener entre 8 y 16 caracteres';
  } else if (!password.match(/[a-z]/)) {
    errorMessage.textContent = 'La contraseña debe contener al menos una letra minúscula';
  } else if (!password.match(/[A-Z]/)) {
    errorMessage.textContent = 'La contraseña debe contener al menos una letra mayúscula';
  } else if (!password.match(/\d/)) {
    errorMessage.textContent = 'La contraseña debe contener al menos un número';
  } else if (!password.match(/[#$@!%&*?_]/)) {
    errorMessage.textContent = 'La contraseña debe contener al menos un carácter especial (#$@!%&*?_)';
  } else {
    errorMessage.textContent = '';
  }
});
