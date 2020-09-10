currentRow = null;

$(document).ready(function(){
    $(".add-row").click(function(){

        var id = $("#id").val();
        var name = $("#name").val();
        var age = $("#age").val();
        var gender = $("#gender").val();

        var new_row = '<tr><td class="delete"><input type="checkbox" name="record"></td>' +
        '<td class="id">' + id + '</td>' +
        '<td class="name">' + name + '</td>' +
        '<td class="age">' + age + '</td>' +
        '<td class="gender">' + gender + '</td>' +
        '<td class="update"><button id="'+id+'" class="btnUpdate">UPDATE</button></td>';

        if(currentRow){       
            $("table tbody").find($(currentRow)).replaceWith(new_row);
            currentRow = null;
        }else{
            $("table tbody").append(new_row);
        }    
    });

    $(document).on('click', '.btnUpdate', function () {
        console.log()
        currentRow= $(this).parents('tr');                  
        $("#update_id").val($(this).closest('tr').find('td.id').text());
        $("#update_name").val($(this).closest('tr').find('td.name').text());
        $("#update_age").val($(this).closest('tr').find('td.age').text());
        $("#update_gender").val($(this).closest('tr').find('td.gender').text());


    });
    
    // Find and remove selected table rows
    $(".delete-row").click(function(){
        $("table tbody").find('input[name="record"]').each(function(){
            if($(this).is(":checked")){
                $(this).parents("tr").remove();
            }
        });
    });
});
