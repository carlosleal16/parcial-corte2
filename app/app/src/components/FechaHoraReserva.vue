<template>
    <ion-item>
      <ion-label>Fecha y Hora</ion-label>
      <ion-datetime v-model="fechaHora" presentation="date-time"></ion-datetime>
    </ion-item>
  </template>
  
  <script setup>
  import { ref, defineEmits, watch } from 'vue';
  
  const emit = defineEmits(['update:fechaHora']);
  const fechaHora = ref(new Date().toISOString());
  
  watch(fechaHora, (val) => {
    emit('update:fechaHora', val);
  });
  </script>
  
