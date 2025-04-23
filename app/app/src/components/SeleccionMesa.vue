<template>
    <ion-list>
      <ion-radio-group v-model="mesaSeleccionada" @ionChange="emit('update:mesa', mesaSeleccionada)">
        <ion-item v-for="mesa in mesasDisponibles" :key="mesa.id">
          <ion-label>Mesa {{ mesa.numero }}</ion-label>
          <ion-radio slot="start" :value="mesa.id"></ion-radio>
        </ion-item>
      </ion-radio-group>
    </ion-list>
  </template>
  
  <script setup>
  import { defineProps, ref, defineEmits } from 'vue';
  
  const props = defineProps({
    mesasDisponibles: Array
  });
  
  const emit = defineEmits(['update:mesa']);
  const mesaSeleccionada = ref(null);
  </script>
  
