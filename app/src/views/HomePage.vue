<template>
  <ion-page>
    <ion-header>
      <ion-toolbar>
        <ion-title>Gestión de Reservas</ion-title>
      </ion-toolbar>
    </ion-header>
    <ion-content class="ion-padding">
      <FechaHoraReserva @update:fechaHora="reserva.fechaHora = $event" />
      <DatosCliente @update:cliente="reserva.cliente = $event" />
      <SeleccionMesa :mesasDisponibles="mesas" @update:mesa="reserva.mesaId = $event" />
      <ion-button expand="full" @click="guardarReserva">Guardar Reserva</ion-button>
    </ion-content>
  </ion-page>
</template>

<script setup>
import { ref } from 'vue';
import FechaHoraReserva from '@/components/FechaHoraReserva.vue';
import DatosCliente from '@/components/DatosCliente.vue';
import SeleccionMesa from '@/components/SeleccionMesa.vue';

const reserva = ref({
  fechaHora: '',
  cliente: {},
  mesaId: null
});

const mesas = ref([
  { id: 1, numero: '1' },
  { id: 2, numero: '2' },
  { id: 3, numero: '3' }
]);

const guardarReserva = () => {
  console.log('Reserva enviada:', reserva.value);
  
};
</script>

