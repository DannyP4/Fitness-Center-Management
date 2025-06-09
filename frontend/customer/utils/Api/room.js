import { Http } from "../Http";

export const getRooms = () => Http.get("/rooms");
export const getEquipmentsByRoom = (id) => Http.get(`/rooms/${id}/equipments`)

export const createRoom = (data) => Http.post("/rooms", data);
export const updateRoom = (id, data) => Http.put(`/rooms/${id}`, data)