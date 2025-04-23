<template>
    <ion-list>
      <ion-item>
        <ion-label position="floating">Nombre</ion-label>
        <ion-input v-model="nombre"></ion-input>
      </ion-item>
      <ion-item>
        <ion-label position="floating">Contacto</ion-label>
        <ion-input v-model="contacto"></ion-input>
      </ion-item>
    </ion-list>
  </template>
  
  <script setup>
  import { ref, defineEmits, watch } from 'vue';
  
  const emit = defineEmits(['update:cliente']);
  const nombre = ref('');
  const contacto = ref('');
  
  watch([nombre, contacto], () => {
    emit('update:cliente', { nombre: nombre.value, contacto: contacto.value });
  });
  </script>
  
