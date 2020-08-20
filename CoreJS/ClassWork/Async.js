while(true){
    const date = new Date();
    
    postMessage(date.getHours()+":"+date.getMinutes()+":"+date.getSeconds());
}