if (process.argv.length <= 2) {
    console.log("Hello Swabhav TechLab");
    console.log(__dirname);
    console.log(__filename);
    process.exit(-1);
}

for (let i = 2; i < process.argv.length; i++) {
    console.log("Hello ",(process.argv[i]));
}