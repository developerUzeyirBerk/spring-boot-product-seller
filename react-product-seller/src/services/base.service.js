/* eslint-disable no-restricted-globals */
//equal to function autHeader()
import store from '../store';
import axios from 'axios';
import { clearCurrentUser } from '../store/actions/user';
import {history} from '../common/history.js';

export const authHeader = () => {
  const currentUser = store.getState().user;
  console.log("user : " + currentUser)
const newAccessToken =currentUser?.token;
  return{

      'Accept' : 'application/json,text/plain, */*',
      'Content-Type':'application/json',
      'Authorization':  `Bearer ${newAccessToken}`,
      'Access-Control-Allow-Methods': "GET, POST, PUT, DELETE, OPTIONS"

  };
};

export function handleResponseWithLoginCheck(){
    axios.interceptors.response.use(
        response => response,
        error => {
            const currentUser = store.getState().user;
            const isLoggedIn = currentUser?.token;
            const status = error?.response?.status;

            if (isLoggedIn && [401,403].includes(status)) {
                store.dispatch(clearCurrentUser());
                history.push('/login');
            }

            return Promise.reject(error);
        }
    );
};