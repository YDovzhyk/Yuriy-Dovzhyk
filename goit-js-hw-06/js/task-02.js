const ingredients = [
  'Potatoes',
  'Mushrooms',
  'Garlic',
  'Tomatos',
  'Herbs',
  'Condiments',
];

const ulIngradients = document.querySelector('#ingredients');
console.log(ulIngradients);

const makeListItem = (el) => {

  const listItemEl = document.createElement('li');
  listItemEl.classList.add('item');
  listItemEl.innerText = el;

  // console.log(listItemEl);
  return listItemEl;

};

const liArrItems = ingredients.map(el => {
    return makeListItem(el);
  });

  ulIngradients.append(...liArrItems);


    // const listItemEl = document.createElement('li');
    // listItemEl.innerText = 'Potatoes';
    // console.log(listItemEl);
    // const ulIngradients = document.querySelector('#ingredients');
    // console.log(ulIngradients);
    // ulIngradients.append(listItemEl);