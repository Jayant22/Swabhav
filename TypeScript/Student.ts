interface IStudent{
    id: number,
    name: string,
    cgpa: number
}

function printInfo(students:IStudent[]){
    for (let student of students) {
        console.log(student);
    }
}

printInfo([
    {id: 101,name : "Jayant",cgpa : 7},
    {id: 102,name : "Paras",cgpa : 8},
    {id: 103,name : "Shailesh",cgpa : 9},
])